package pl.digitalvirgo.dao.repositories

import org.springframework.data.repository.CrudRepository
import pl.digitalvirgo.dao.entity.Customer
import pl.digitalvirgo.dao.entity.Product

/**
 * Created by tsieciechowicz on 11.01.2017.
 */

interface ProductRepository : CrudRepository<Product, Long> {
    fun findByName(name: String): List<Customer>
}