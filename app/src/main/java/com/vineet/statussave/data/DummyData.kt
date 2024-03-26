package com.vineet.statussave.data

class DummyData {
     lateinit var  stories: ArrayList<Story>


     fun getData() : ArrayList<Story>{
         stories = ArrayList()
         for(i in 1..10){
             stories.add(Story("https://images.pexels.com/photos/18561732/pexels-photo-18561732/free-photo-of-a-woman-in-a-black-dress-taking-a-picture-in-an-arched-hallway.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2"))
         }
         return stories
     }
}