package com.fois.Back_end_fois_smile.controller;

import java.util.ArrayList;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fois.Back_end_fois_smile.entity.Account;
import com.fois.Back_end_fois_smile.entity.AccountInformation;
import com.fois.Back_end_fois_smile.form.RegistrationForm;
import com.fois.Back_end_fois_smile.mapper.AccountInformationMapper;
import com.fois.Back_end_fois_smile.mapper.AccountMapper;

@RequestMapping("/account")
@CrossOrigin()
@Controller
public class LoginController {
    @Autowired
    AccountMapper accountMapper;
    
    @Autowired
    AccountInformationMapper accountInformationMapper;

    @RequestMapping(produces = "application/json")
    @ResponseBody
    public Account getAccount(String username, String password) {
        return this.accountMapper.getAccount(username, password);
    }
    
    @RequestMapping(value = "/getAllHV", produces = "application/json")
    @ResponseBody
    public ArrayList<Account> getAllAccHV() {
        return this.accountMapper.getAllAccHV();
    }
    
    @RequestMapping(value = "/removeTKHV", produces = "application/json")
    @ResponseBody
    public void removeTKHV(int matk) {
        this.accountMapper.removeAccHV(matk);
    }
    
    @RequestMapping(value = "/admin", produces = "application/json")
    @ResponseBody
    public Account getAccAdmin(String username, String password) {
        return this.accountMapper.getAccAdmin(username, password);
    }
    
    @RequestMapping(value = "/update",produces = "application/json")
    @ResponseBody
    public boolean updateAccount(int matk, String username, String password, Integer loaitk, long thoigiandn, Boolean remove){
        Date dateLogin = new Date(thoigiandn);
        Account account = new Account(matk, username, password, loaitk, dateLogin, remove);
        this.accountMapper.updateAccount(account);
        return true;
    }    
    
    @RequestMapping(value = "/info/update",produces = "application/json")
    @ResponseBody
    public void updateInfor(int matt, String hoten, long ngaysinh, int gioitinh, String diachi, int matk){
        Date ns;
        if(ngaysinh != 0)
            ns = new Date(ngaysinh);
        else ns = null;
        
        AccountInformation aInformation = new AccountInformation(matt, hoten, ns, gioitinh, diachi, matk);
        this.accountInformationMapper.updateAccountInfo(aInformation);
    }
    
    @RequestMapping(value = "/getAllHVInfor", produces = "application/json")
    @ResponseBody
    public ArrayList<AccountInformation> getAllHVInfor() {
        return this.accountInformationMapper.getAllHVInformation();
    }
    
    @RequestMapping(value = "/infor", produces = "application/json")
    @ResponseBody
    public AccountInformation getAccountInfor(int matk) {
        return this.accountInformationMapper.getAccountInformation(matk);
    }
    
    @RequestMapping(value = "/regis", produces = "application/json")
    @ResponseBody
    public boolean registration(String record) {
        ObjectMapper om = new ObjectMapper();
        RegistrationForm regis;
        boolean dangky = false;
        try {
            regis = om.readValue(record, RegistrationForm.class);
            String user = regis.getUsername();
            String pass = regis.getPass();
            String hoten = regis.getHoten();
            int loaitk = regis.getLoaitk();
            Account acc = accountMapper.getAccByMail(user);
            if(acc == null) {
                this.accountMapper.registration(user, pass, loaitk);
                Account account = this.accountMapper.getAccount(user, pass);
                int matk = account.getMatk();
                this.accountInformationMapper.registration(hoten, matk);
                dangky = true;
            }
            else {
                dangky = false;
            }
        } catch (JsonMappingException e) {
        } catch (JsonProcessingException e) {
        }
        return dangky;
    }
}
