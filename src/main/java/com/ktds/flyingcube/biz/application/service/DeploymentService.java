package com.ktds.flyingcube.biz.application.service;

import com.ktds.flyingcube.biz.application.domain.Deployment;
import com.ktds.flyingcube.biz.application.dto.DeploymentReq.FindDto;
import com.ktds.flyingcube.biz.application.dto.DeploymentRes;
import com.ktds.flyingcube.biz.application.dto.DeploymentRes.OneDto;
import com.ktds.flyingcube.biz.application.mapper.DeploymentMapper;
import com.ktds.flyingcube.biz.application.repository.DeploymentQueryRepository;
import com.ktds.flyingcube.biz.application.repository.DeploymentRepository;
import com.ktds.flyingcube.common.exception.ApplicationExType;
import com.ktds.flyingcube.common.exception.ApplicationException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import static com.ktds.flyingcube.biz.application.dto.DeploymentRes.AllDto;

@Slf4j
@RequiredArgsConstructor
@Service
public class DeploymentService {

    private final DeploymentRepository deploymentRepository;
    private final DeploymentQueryRepository deploymentQueryRepository;
    private final DeploymentMapper deploymentMapper;

    // get all
    public Page<AllDto> findDeployments(FindDto findDto, Pageable pageable) {
        return deploymentQueryRepository.selectDeployments(findDto, pageable);
    }

    // get one
    public OneDto findDeployment(Integer deploymentId) {
        Deployment deployment = deploymentRepository.findById(deploymentId)
                .orElseThrow(() -> new ApplicationException(ApplicationExType.NOT_FOUND));
        return deploymentMapper.toDto(deployment);
    }
}
