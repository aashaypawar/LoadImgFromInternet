package com.aashay.loadimgfrominternet

import android.os.Handler
import android.os.Looper
import java.util.concurrent.Callable
import java.util.concurrent.Executor
import java.util.concurrent.Executors

class TaskRunner {
    private var executor = Executors.newSingleThreadExecutor()
    private var handler = Handler(Looper.getMainLooper())
}