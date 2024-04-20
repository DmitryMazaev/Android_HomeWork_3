package com.example.android_homework_3

class TrackList {
    var count: Int = 0
    var track1 = Track("Скованные")
    var track2 = Track("Князь тишины")
    var track3 = Track("Взгляд с экрана")
    var track4 = Track("Стриптиз")
    var track5 = Track("Доктор твоего тела")
    var track6 = Track("Я хочу быть с тобой")
    var track7 = Track("Казанова")
    var track8 = Track("Шар цвета хаки")
    var track9 = Track("Прощальное письмо")

    val trackList: ArrayList<Track> = ArrayList()

    fun add() {
        trackList.add(track1)
        trackList.add(track2)
        trackList.add(track3)
        trackList.add(track4)
        trackList.add(track5)
        trackList.add(track6)
        trackList.add(track7)
        trackList.add(track8)
        trackList.add(track9)
    }

    fun nextTrack(): String {
        add()
        if (this.count < trackList.size - 1) {
            this.count += 1
            return trackList.get(this.count).trackName

        }
        else {
            this.count = 0
            return trackList.get(this.count).trackName
        }
    }
    fun previosTrack(): String {
        add()
        if (this.count > 0) {
            this.count -= 1
            return trackList.get(this.count).trackName

        }
        else {
            this.count = trackList.size - 1
            return trackList.get(this.count).trackName
        }
    }
}