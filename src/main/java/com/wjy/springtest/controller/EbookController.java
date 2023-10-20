package com.wjy.springtest.controller;

import com.wjy.springtest.domain.Ebook;
import com.wjy.springtest.req.EbookReq;
import com.wjy.springtest.resp.CommonResp;
import com.wjy.springtest.resp.EbookResp;
import com.wjy.springtest.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wangxi
 * @version 1.0
 * @description: TODO
 * @date 2023/10/20 15:13
 */

@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Resource
    private EbookService ebookService;

    @GetMapping("/list")
    public CommonResp list(EbookReq req) {
        CommonResp<List<EbookResp>> resp = new CommonResp<>();
        List<EbookResp> ebookList = ebookService.ebookList(req);
        resp.setContent(ebookList);
        return resp;
    }
}
