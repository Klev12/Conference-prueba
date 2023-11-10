package com.example.conference10.repository

import com.example.conference10.model.Conference
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ConferenceRepository : JpaRepository<Conference, Long?> {

    fun findById (id: Long?): Conference?


}