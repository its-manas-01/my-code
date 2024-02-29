from pytube import YouTube

YouTubeobject=YouTube(input())

YouTubeobject=YouTubeobject.streams.get_highest_resolution()

YouTubeobject.download()