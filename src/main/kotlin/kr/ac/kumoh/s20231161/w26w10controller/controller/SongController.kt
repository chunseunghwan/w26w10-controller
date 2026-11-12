package kr.ac.kumoh.s20231161.w26w10controller.controller

import kr.ac.kumoh.s20231161.w26w10controller.sevice.SongService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class SongController(private val songService: SongService) {
    val title = listOf("갓튀긴 후라이드", "반반 치킨 18000원", "Velvet Bitter", "소란스러운 비밀")

    @GetMapping("/songs")
    fun getSongs() = songService.findALLSongs()
}