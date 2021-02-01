package com.ktds.flyingcube.biz.application.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QDeployment is a Querydsl query type for Deployment
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDeployment extends EntityPathBase<Deployment> {

    private static final long serialVersionUID = 782227637L;

    public static final QDeployment deployment = new QDeployment("deployment");

    public final com.ktds.flyingcube.common.jpa.QAuditorBaseEntity _super = new com.ktds.flyingcube.common.jpa.QAuditorBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDt = _super.createdDt;

    public final StringPath deploymentName = createString("deploymentName");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath namespace = createString("namespace");

    public final NumberPath<Integer> replicas = createNumber("replicas", Integer.class);

    public final StringPath triggerStg = createString("triggerStg");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedDt = _super.updatedDt;

    public final StringPath updateStg = createString("updateStg");

    public QDeployment(String variable) {
        super(Deployment.class, forVariable(variable));
    }

    public QDeployment(Path<? extends Deployment> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDeployment(PathMetadata metadata) {
        super(Deployment.class, metadata);
    }

}

