package pl.digitalvirgo.dao.repositories

import org.springframework.data.repository.CrudRepository
import pl.digitalvirgo.dao.entity.Customer

/**
 * Created by tsieciechowicz on 10.01.2017.
 */
interface CustomerRepository : CrudRepository<Customer, Long> {
    fun findByName(name: String): List<Customer>
}
