package com.sayi.sayiocr

import android.net.Uri

class FolderMeta {
    var title = "no title"
    var page = 0
    var titleLastPage = "$title  Page: $page"
    var pickedNumber = 0
    var isPageUpdated = false
    var folderTotalPages = 0
    var uriList = ArrayList<Uri>()
    var saverPermit = false
}