package kr.ac.kumoh.s20231161.w26w10controller.service
import kr.ac.kumoh.s20231161.w26w10controller.repository.SongRepository
import org.springframework.stereotype.Service

@Service
class SongService(
    private val repository: SongRepository
) {
    fun findAllSongs() = repository.findAll()
}