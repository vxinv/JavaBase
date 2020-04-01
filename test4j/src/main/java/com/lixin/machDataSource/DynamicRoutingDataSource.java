package com.lixin.machDataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DynamicRoutingDataSource extends AbstractRoutingDataSource {


    private Logger log = LoggerFactory.getLogger(this.getClass());


    @Override
    protected Object determineCurrentLookupKey() {
        log.debug("Current DataSouce is {}",DynamicDataSourceContextHolder.getDataSourcekey());
        return DynamicDataSourceContextHolder.getDataSourcekey();
    }

}
