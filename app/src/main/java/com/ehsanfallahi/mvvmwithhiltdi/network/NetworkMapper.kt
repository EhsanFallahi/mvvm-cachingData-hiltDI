package com.ehsanfallahi.mvvmwithhiltdi.network

import com.ehsanfallahi.mvvmwithhiltdi.mapper.EntityMapper
import com.ehsanfallahi.mvvmwithhiltdi.model.Blog

//for mapping a network object to blog object
class NetworkMapper
//@Inject
constructor():EntityMapper<BlogNetworkEntity,Blog>
{
    override fun mapFromEntity(entity: BlogNetworkEntity): Blog {
        return Blog(
            id=entity.id,
            title = entity.title,
            body = entity.body,
            image = entity.image,
            category = entity.category
        )
    }

    override fun mapToEntity(domainModel: Blog): BlogNetworkEntity {
        return BlogNetworkEntity(
            id=domainModel.id,
            title = domainModel.title,
            body = domainModel.body,
            image = domainModel.image,
            category = domainModel.category
        )
    }

    suspend fun mapFromEntityList(entities:List<BlogNetworkEntity>):List<Blog>{
        return entities.map { mapFromEntity(it) }
    }
}