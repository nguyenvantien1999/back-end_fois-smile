package com.fois.Back_end_fois_smile.controller;

import java.sql.Date;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fois.Back_end_fois_smile.form.ReplyForm;
import com.fois.Back_end_fois_smile.mapper.ReplyMapper;

@CrossOrigin()
@Controller
public class ReplyController {
    @Autowired
    ReplyMapper replyMapper;
    
    @RequestMapping(value = "/reply/addreply", produces = "application/json")
    @ResponseBody
    public void addReply(String ndrep, long thoigian, int matk, int mabl) {
        Date tg = new Date(thoigian);
        this.replyMapper.addReply(ndrep, tg, matk, mabl);
    }
    
    @RequestMapping(value = "/reply/getreply", produces = "application/json")
    @ResponseBody
    public ArrayList<ReplyForm> getByMaBL(int mabl) {
        return this.replyMapper.selectByMabl(mabl);
    }
    
    @MessageMapping("/repSocket")
    @ResponseBody
    @SendTo("/topic/getRepSocket")
    public ArrayList<ReplyForm> getRepSocket(int mabl) throws Exception {
        Thread.sleep(1000);
        System.out.println("mabl: "+ mabl);
        return getByMaBL(mabl);
    }
}
