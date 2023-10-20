package com.wjy.springtest.service;

import com.wjy.springtest.domain.Ebook;
import com.wjy.springtest.domain.EbookExample;
import com.wjy.springtest.mapper.EbookMapper;
import com.wjy.springtest.req.EbookReq;
import com.wjy.springtest.resp.EbookResp;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wangxi
 * @version 1.0
 * @description: TODO
 * @date 2023/10/20 15:10
 */
@Service
public class EbookService {

    @Resource
    private EbookMapper ebookMapper;

    public List<EbookResp> ebookList(EbookReq req) {
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%" + req.getName() + "%");

        List<Ebook> ebookLists = ebookMapper.selectByExample(ebookExample);

        List<EbookResp> respList = new ArrayList<>();

        for (Ebook ebook : ebookLists) {
            EbookResp ebookResp = new EbookResp();
            BeanUtils.copyProperties(ebook,ebookResp);

            respList.add(ebookResp);
        }

        return respList;
    }
}
