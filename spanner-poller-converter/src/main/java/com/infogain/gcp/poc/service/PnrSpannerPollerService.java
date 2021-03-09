package com.infogain.gcp.poc.service;

import com.infogain.gcp.poc.component.PnrPollerRecordConverter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PnrSpannerPollerService {

    @Autowired
    private PnrPollerRecordConverter pnrPollerRecordConverter;

}