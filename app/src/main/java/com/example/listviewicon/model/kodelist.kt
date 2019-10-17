package com.example.listviewicon.model

import com.example.listviewicon.R

object kodelist {
    private val namaIcon = arrayOf(
        "Ruby",
        "Rails",
        "Python",
        "Java Script",
        "PHP"
    )

    private val detailIcon = arrayOf(
        "Ruby is an open-source and fully object-oerlented programming language",
        "Ruby on Rails is a server-side web application development framework written in Ruby language",
        "Python is interpreted scripting adn object-oriented programming",
        "Java Script is an object-based scripting language.",
        "PHP is an interpreted language.i.e there is no need for compilation"
    )

    private val logoicon = intArrayOf(
        R.drawable.rubii,
        R.drawable.railsi,
        R.drawable.pytoni,
        R.drawable.javascript,
        R.drawable.phpi
    )

    val codelist: ArrayList<kodeicon>
        get() {
            val list = arrayListOf<kodeicon>()
            for (position in namaIcon.indices) {
                val kod = kodeicon ()
                kod.nama = namaIcon[position]
                kod.detail = detailIcon[position]
                kod.logo = logoicon[position]
                list.add(kod)
            }
            return list
        }
}