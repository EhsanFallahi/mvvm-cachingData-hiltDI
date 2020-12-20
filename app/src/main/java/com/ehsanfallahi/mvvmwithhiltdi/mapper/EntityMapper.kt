package com.ehsanfallahi.mvvmwithhiltdi.mapper

interface EntityMapper<Entity,DomainModel> {
    //BlogModel is a domainModel
    fun mapFromEntity(entity:Entity):DomainModel

    fun mapToEntity(domainModel: DomainModel):Entity
}