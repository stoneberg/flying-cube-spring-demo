package com.ktds.flyingcube.biz.application.domain;


import com.ktds.flyingcube.common.jpa.AuditorBaseEntity;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;

@Slf4j
@Builder
@Getter
@ToString
@EqualsAndHashCode(callSuper = false, of = "id")
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_deployment")
public class Deployment extends AuditorBaseEntity {

    @Id
    @Column(name = "deployment_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 50, nullable = false)
    private String deploymentName;

    @Column(length = 50, nullable = false)
    private String namespace;

    @Column(nullable = false)
    private Integer replicas;

    @Column(length = 25, nullable = false)
    private String triggerStg;

    @Column(length = 25, nullable = false)
    private String updateStg;
}

