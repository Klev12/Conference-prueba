package com.example.conference10.service

import com.example.conference10.model.Conference
import com.example.conference10.repository.ConferenceRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class ConferenceService {
    @Autowired
    lateinit var conferenceRepository: ConferenceRepository

    fun list ():List<Conference>{
        return conferenceRepository.findAll()
    }

    fun save(conference: Conference): Conference {
        try{
            return conferenceRepository.save(conference)
        }
        catch (ex:Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND,ex.message)
        }
    }
    fun listById (id:Long?): Conference?{
        return conferenceRepository.findById(id)
    }
}