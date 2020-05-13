package com.example.dictionnaire


import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.MediaController
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.fragment_meaning.*

/**
 * A simple [Fragment] subclass.
 */
class MeaningFragment : Fragment() {

    companion object {
        var playing: MediaPlayer? = null

    }

    init {
        playing?.setOnCompletionListener { player -> player.release() }
    }

    private var mc: MediaController? = null

    private var word:Word? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_meaning, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
            word = MeaningFragmentArgs.fromBundle(it).word
            wordText.setText(word?.wordText)
            word_type.setText(word?.type)
            meaning.setText(word?.meaning)
        }

        button_speak.setOnClickListener {
            val player = MediaPlayer()
            player.setDataSource(word!!.sound)
            player.prepare()
            if (playing != null){
                if ((playing as MediaPlayer).isPlaying) {
                    playing?.stop()
                    playing?.release()
                }
            }
            playing = player
            playing?.start()
        }

        Glide.with(this).load(word!!.image).apply(RequestOptions.placeholderOf(R.drawable.ic_launcher_background)
            .error(R.drawable.ic_launcher_background))
            .into(imageView2)

        imageView2.setOnClickListener {
            videoPlayer.visibility = View.VISIBLE
            imageView2.visibility = View.INVISIBLE
            card.visibility = View.INVISIBLE
            if (mc==null){
                mc = MediaController(requireContext())
                videoPlayer.setMediaController(mc)
                videoPlayer.setVideoPath("https://www.ebookfrenzy.com/android_book/movie.mp4")
                videoPlayer.start()
            } else {
                if (!videoPlayer.isPlaying) {
                    videoPlayer.start()
                } else {
                    videoPlayer.pause()
                }
            }

        }
    }

}
