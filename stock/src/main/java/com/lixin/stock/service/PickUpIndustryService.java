package com.lixin.stock.service;

import cn.hutool.core.util.StrUtil;
import com.lixin.stock.mapper.IndustrySimpleMapper;
import com.lixin.stock.model.IndustrySimple;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PickUpIndustryService {

    Logger LOG = LoggerFactory.getLogger(PickUpIndustryService.class);

    @Autowired
    WebClientService webClientService;

    String url_prefix = "https://xueqiu.com/hq#exchange=CN&plate={}&firstName={}&secondName={}&level2code={}";

    @Autowired
    IndustrySimpleMapper ism;


    public void pickUp() {

        List<IndustrySimple> industrySimples = ism.selectByExample(null);
        for (IndustrySimple industrySimple : industrySimples) {
            String str = StrUtil.format(url_prefix, industrySimple.getPlate(), industrySimple.getFirstName(), industrySimple.getSecondName(), industrySimple.getLevel2code());
            Optional<String> page = webClientService.getPage(str, 3000);
            LOG.error(page.get());
        }
    }


}
