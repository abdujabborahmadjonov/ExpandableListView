package dev.abdujabbor.homeandroidecpandabellistview

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.abdujabbor.homeandroidecpandabellistview.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var map: HashMap<String, ArrayList<String>>
    lateinit var titleList: ArrayList<String>
    lateinit var binding: ActivityMainBinding
    lateinit var openArray: ArrayList<String>
    lateinit var developmentArray: ArrayList<String>
    lateinit var uploadingArray: ArrayList<String>
    lateinit var rejectArray: ArrayList<String>
    lateinit var closedArray: ArrayList<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        keshdanArrayga()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val adapter = ExpandetAdapter(titleList,map)
        binding.myEAdapter.setAdapter(adapter)

        binding.myEAdapter.setOnChildClickListener { parent, v, groupPosition, childPosition, id ->
            val intent = Intent(this, MainActivity2::class.java)
            var list = ArrayList<Section>()
            list.add(Section("mi","Redmi phones use the Xiaomi's MIUI user interface on top of Android. Models are divided into the entry-level Redmi, the mid-range Redmi Note, and the high-end Redmi K.","mobiles"))
            list.add(Section("realmi","\tSmartphones Tablet computers Earphones Powerbanks Realme UI Phone cases AIoT products Bags Smart TVs Smart Watch Smart Band","mobiles"))
            list.add(Section("iphone","The iPhone is a line of smartphones designed and marketed by Apple Inc. These devices use Apple's iOS mobile operating system. The first-generation iPhone was announced by then-Apple CEO Steve Jobs on January 9, 2007. Since then, Apple has annually released new iPhone models and iOS updates.","mobiles"))
            list.add(Section("vivo","Vivo Communication Technology Co. Ltd. (styled as vivo) is a Chinese multinational technology company headquartered in Dongguan, Guangdong that designs and develops smartphones, smartphone accessories, software and online services. The company develops software for its phones, distributed through its","mobiles"))
            list.add(Section("oppo","Guangdong Oppo Mobile Telecommunications Corp., Ltd, doing business as OPPO, is a Chinese consumer electronics manufacturer headquartered in Dongguan, Guangdong. Its major product lines include smartphones, smart devices, audio devices, power banks, and other electronic products.","mobiles"))

            var laptopList = ArrayList<Section>()
            laptopList.add(Section("iPad","We've listed below the best laptops for a variety of budgets and use cases, and every laptop has been thoroughly tested and reviewed by us, so you can be sure that if you buy any of the laptops below, you'll be getting an absolutely fantastic device.","laptop"))
            laptopList.add(Section("Lenovo Laptop","The brilliant Lenovo IdeaPad Duet Chromebook proves how good modern Chromebooks are these days. It can be used as a laptop or a tablet, and it's backed up by some very impressive specs.","laptop"))
            laptopList.add(Section("Dell Laptop","At this point, we doubt that the Dell XPS line can do anything wrong. Its regular updates have consistently made it into our best laptops list, and they’re only getting better. The Dell XPS 13 (2022) is a gorgeous piece of kit, as expected, with a new design, gorgeous screen and cutting-edge components.","laptop"))
            laptopList.add(Section("Acer Laptop","Beyond the Acer Swift 3's modest exterior, you'll find an excellent laptop that boasts plenty of power for work and study. The Swift 3 (not to be confused with the Switch 3 another laptop from Acer) is an inexpensive laptop; however, that plain chassis is all-aluminum and packed with beefy components. ","laptop"))
            laptopList.add(Section("Makbook pro","The powerful MacBook Pro 14-inch is easily the best productivity laptop you can buy in 2022. For creative professionals such as photographers, video editors and music producers, the MacBook Pro 14-inch (2021) is a dream to use, thanks to a choice between powerful new M1 Pro or M1 Max chips that can handle even the most intensive workloads with ease","laptop"))
            laptopList.add(Section("HP Laptop","Now coming with 11th-generation Intel Core processors, which offer a decent performance boost, and feature better integrated Intel Iris Xe graphics, the HP Spectre x360 (2021) is better than ever.","laptop"))


            var homeEntertainment = ArrayList<Section>()
            homeEntertainment.add(Section("Home cinema","Home cinema, also called home theaters or theater rooms, are home entertainment audio-visual systems that seek to reproduce a movie theater experience and mood using consumer electronics-grade video and audio equipment that is set up in a room or backyard of a private home.","homeentertainment"))
            homeEntertainment.add(Section("Home game","Home Game is a sports documentary web television series. The series profiles unique and dangerous traditional sports from around the world, as well as the communities and cultures where they thrive.[1][2][3] The series premiered on Netflix on 26 June 2020 and is narrated by Mark Strong.","homeentertainment"))
            homeEntertainment.add(Section("Home feeding","Enteral nutrition, also known as tube feeding, is a way of delivering nutrition directly to your stomach or small intestine. Your doctor might recommend tube feeding if you can't eat enough to get the nutrients you need.","homeentertainment"))
            homeEntertainment.add(Section("feeding animal","Animal feed is food given to domestic animals, especially livestock, in the course of animal husbandry. There are two basic types: fodder and forage. Used alone, the word feed more often refers to fodder. Animal feed is an important input to animal agriculture, and is frequently the main cost of the raising or","homeentertainment"))




            if (titleList[groupPosition]=="Mobiles") {
                intent.putExtra("name", list[childPosition].info)
            }
            if (titleList[groupPosition]=="Laptops") {
                intent.putExtra("name", laptopList[childPosition].info)
            }
            if (titleList[groupPosition]=="Home Entertainment"){
                intent.putExtra("name", homeEntertainment[childPosition].info)
            }

            startActivity(intent)
            true
        }
    }


    private fun keshdanArrayga() {
        map = HashMap()
        titleList = ArrayList()
        titleList.add("Mobiles")
        titleList.add("Laptops")
        titleList.add("Home Entertainment")
        titleList.add("TVs by brand")
        titleList.add("Kitchen Appliances")

        openArray = ArrayList()
        developmentArray = ArrayList()
        uploadingArray = ArrayList()
        rejectArray = ArrayList()
        closedArray = ArrayList()

        var list = ArrayList<Section>()
        list.add(Section("mi","Redmi phones use the Xiaomi's MIUI user interface on top of Android. Models are divided into the entry-level Redmi, the mid-range Redmi Note, and the high-end Redmi K.","mobiles"))
        list.add(Section("realmi","\tSmartphones Tablet computers Earphones Powerbanks Realme UI Phone cases AIoT products Bags Smart TVs Smart Watch Smart Band","mobiles"))
        list.add(Section("iphone","The iPhone is a line of smartphones designed and marketed by Apple Inc. These devices use Apple's iOS mobile operating system. The first-generation iPhone was announced by then-Apple CEO Steve Jobs on January 9, 2007. Since then, Apple has annually released new iPhone models and iOS updates.","mobiles"))
        list.add(Section("vivo","Vivo Communication Technology Co. Ltd. (styled as vivo) is a Chinese multinational technology company headquartered in Dongguan, Guangdong that designs and develops smartphones, smartphone accessories, software and online services. The company develops software for its phones, distributed through its","mobiles"))
        list.add(Section("oppo","Guangdong Oppo Mobile Telecommunications Corp., Ltd, doing business as OPPO, is a Chinese consumer electronics manufacturer headquartered in Dongguan, Guangdong. Its major product lines include smartphones, smart devices, audio devices, power banks, and other electronic products.","mobiles"))

        var laptopList = ArrayList<Section>()
        laptopList.add(Section("iPad","We've listed below the best laptops for a variety of budgets and use cases, and every laptop has been thoroughly tested and reviewed by us, so you can be sure that if you buy any of the laptops below, you'll be getting an absolutely fantastic device.","laptop"))
        laptopList.add(Section("Lenovo Laptop","The brilliant Lenovo IdeaPad Duet Chromebook proves how good modern Chromebooks are these days. It can be used as a laptop or a tablet, and it's backed up by some very impressive specs.","laptop"))
        laptopList.add(Section("Dell Laptop","At this point, we doubt that the Dell XPS line can do anything wrong. Its regular updates have consistently made it into our best laptops list, and they’re only getting better. The Dell XPS 13 (2022) is a gorgeous piece of kit, as expected, with a new design, gorgeous screen and cutting-edge components.","laptop"))
        laptopList.add(Section("Acer Laptop","Beyond the Acer Swift 3's modest exterior, you'll find an excellent laptop that boasts plenty of power for work and study. The Swift 3 (not to be confused with the Switch 3 another laptop from Acer) is an inexpensive laptop; however, that plain chassis is all-aluminum and packed with beefy components. ","laptop"))
        laptopList.add(Section("Makbook pro","The powerful MacBook Pro 14-inch is easily the best productivity laptop you can buy in 2022. For creative professionals such as photographers, video editors and music producers, the MacBook Pro 14-inch (2021) is a dream to use, thanks to a choice between powerful new M1 Pro or M1 Max chips that can handle even the most intensive workloads with ease","laptop"))
        laptopList.add(Section("HP Laptop","Now coming with 11th-generation Intel Core processors, which offer a decent performance boost, and feature better integrated Intel Iris Xe graphics, the HP Spectre x360 (2021) is better than ever.","laptop"))


        var homeEntertainment = ArrayList<Section>()
        homeEntertainment.add(Section("Home cinema","Home cinema, also called home theaters or theater rooms, are home entertainment audio-visual systems that seek to reproduce a movie theater experience and mood using consumer electronics-grade video and audio equipment that is set up in a room or backyard of a private home.","homeentertainment"))
        homeEntertainment.add(Section("Home game","Home Game is a sports documentary web television series. The series profiles unique and dangerous traditional sports from around the world, as well as the communities and cultures where they thrive.[1][2][3] The series premiered on Netflix on 26 June 2020 and is narrated by Mark Strong.","homeentertainment"))
        homeEntertainment.add(Section("Home feeding","Enteral nutrition, also known as tube feeding, is a way of delivering nutrition directly to your stomach or small intestine. Your doctor might recommend tube feeding if you can't eat enough to get the nutrients you need.","homeentertainment"))
        homeEntertainment.add(Section("feeding animal","Animal feed is food given to domestic animals, especially livestock, in the course of animal husbandry. There are two basic types: fodder and forage. Used alone, the word feed more often refers to fodder. Animal feed is an important input to animal agriculture, and is frequently the main cost of the raising or","homeentertainment"))




        for (todo in list){
    when(todo.level){
        "mobiles"->openArray.add(todo.name)
    }
}
        for (todo in laptopList){
    when(todo.level){
        "laptop"->developmentArray.add(todo.name)
    }
}
        for (todo in homeEntertainment){
    when(todo.level){
        "homeentertainment"->uploadingArray.add(todo.name)
    }
}

        map[titleList[0]] = openArray
        map[titleList[1]] = developmentArray
        map[titleList[2]] = uploadingArray
        map[titleList[3]] = rejectArray
        map[titleList[4]] = closedArray

    }


}


