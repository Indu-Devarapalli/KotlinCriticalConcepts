package com.example.myapplication

// Step 1: Target interface
interface MediaPlayer {
    fun play(type: String, fileName: String)
}

// Step 2: Adaptee classes (incompatible players)
class VlcPlayer {
    fun playVlc(fileName: String) = println("Playing VLC file: $fileName")
}

class Mp4Player {
    fun playMp4(fileName: String) = println("Playing MP4 file: $fileName")
}

// Step 3: Adapter to bridge the gap
class MediaAdapter(private val type: String) : MediaPlayer {
    override fun play(type: String, fileName: String) {
        when (type.lowercase()) {
            "vlc" -> VlcPlayer().playVlc(fileName)
            "mp4" -> Mp4Player().playMp4(fileName)
        }
    }
}

// Step 4: AudioPlayer using adapter
class AudioPlayer : MediaPlayer {
    override fun play(type: String, fileName: String) {
        when (type.lowercase()) {
            "mp3" -> println("Playing MP3 file: $fileName")
            "mp4", "vlc" -> MediaAdapter(type).play(type, fileName)
            else -> println("Unsupported format: $type")
        }
    }
}


fun main() {
    val player = AudioPlayer()

    player.play("mp3", "song.mp3")
    player.play("mp4", "movie.mp4")
    player.play("vlc", "lecture.vlc")
    player.play("avi", "clip.avi")  // Unsupported format
}
