package com.dsm.unlimited.applebox_android.customview

import android.content.Context
import android.view.LayoutInflater

fun Context.getLayoutInflater(service : String) = this.getSystemService(service) as LayoutInflater