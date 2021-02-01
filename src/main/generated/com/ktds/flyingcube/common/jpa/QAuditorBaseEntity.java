package com.ktds.flyingcube.common.jpa;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAuditorBaseEntity is a Querydsl query type for AuditorBaseEntity
 */
@Generated("com.querydsl.codegen.SupertypeSerializer")
public class QAuditorBaseEntity extends EntityPathBase<AuditorBaseEntity> {

    private static final long serialVersionUID = -25110019L;

    public static final QAuditorBaseEntity auditorBaseEntity = new QAuditorBaseEntity("auditorBaseEntity");

    public final DateTimePath<java.time.LocalDateTime> createdDt = createDateTime("createdDt", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> updatedDt = createDateTime("updatedDt", java.time.LocalDateTime.class);

    public QAuditorBaseEntity(String variable) {
        super(AuditorBaseEntity.class, forVariable(variable));
    }

    public QAuditorBaseEntity(Path<? extends AuditorBaseEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAuditorBaseEntity(PathMetadata metadata) {
        super(AuditorBaseEntity.class, metadata);
    }

}

