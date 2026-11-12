package kr.ac.kumoh.s20231161.w26w10controller.sevice

import kr.ac.kumoh.s20231161.w26w10controller.model.Song
import org.springframework.stereotype.Service

@Service
class SongService {
    fun findALLSongs() = Song(1, "갓튀긴 후라이드", "반반 치킨 18000원")
}