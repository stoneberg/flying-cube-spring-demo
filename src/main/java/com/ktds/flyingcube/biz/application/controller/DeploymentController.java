package com.ktds.flyingcube.biz.application.controller;

import com.ktds.flyingcube.biz.application.dto.DeploymentReq;
import com.ktds.flyingcube.biz.application.dto.DeploymentReq.FindDto;
import com.ktds.flyingcube.biz.application.dto.DeploymentRes;
import com.ktds.flyingcube.biz.application.dto.DeploymentRes.PageDto;
import com.ktds.flyingcube.biz.application.service.DeploymentService;
import com.ktds.flyingcube.common.response.ResponseDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/application")
public class DeploymentController {

    private final DeploymentService deploymentService;

    @GetMapping("/deployments")
    public ResponseDto<?> list(FindDto findDto, Pageable pageable) {
        Page<PageDto> page = deploymentService.findDeployments(findDto, pageable);
        return ResponseDto.of(page);
    }


}
