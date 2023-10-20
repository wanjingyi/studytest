package com.wjy.springtest.service;

import com.wjy.springtest.domain.Ebook;
import com.wjy.springtest.mapper.EbookMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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

    public List<Ebook> ebookList() {
        return ebookMapper.selectByExample(null);
    }
}
