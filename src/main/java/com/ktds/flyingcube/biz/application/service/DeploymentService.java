package com.ktds.flyingcube.biz.application.service;

import com.ktds.flyingcube.biz.application.dto.DeploymentReq.FindDto;
import com.ktds.flyingcube.biz.application.dto.DeploymentRes.PageDto;
import com.ktds.flyingcube.biz.application.repository.DeploymentQueryRepository;
import com.ktds.flyingcube.biz.application.repository.DeploymentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class DeploymentService {

    private final DeploymentRepository deploymentRepository;
    private final DeploymentQueryRepository deploymentQueryRepository;

    public Page<PageDto> findDeployments(FindDto findDto, Pageable pageable) {
        return deploymentQueryRepository.selectDeployments(findDto, pageable);
    }
}
