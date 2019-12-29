package com.dsm.unlimited.domain

import com.dsm.unlimited.domain.enumerater.ChannelCategory
import com.dsm.unlimited.domain.valueobject.*
import java.util.*

fun getChannelList(size : Int) = List<Channel>(size){ getChannel()}

fun getClubList(size : Int) = List<Club>(size){ getClub()}

fun getPoliticsList(size : Int) = List<Politics>(size){ getPolitics()}

fun getPosterList(size : Int) = List<Poster>(size){ getPoster()}

fun getSimpleChatList(size : Int) = List<SimpleChat>(size){ getSimpleChat()}

fun getChannel() = Channel("","","",ChannelCategory.ASK)

fun getClub() = Club("","","","")

fun getPolitics() = Politics("","","","","",0)

fun getPoster() = Poster("","", Date(),"","",0,0)

fun getSimpleChat() = SimpleChat()

fun getProfile() = Profile("","","","")

fun getProfileList(size : Int) = List<Profile>(size){ getProfile()}

fun getChannelChatting() = ChannelChatting("","","",null,"")

fun getChannelChattingList(size : Int) = List(size){ getChannelChatting() }