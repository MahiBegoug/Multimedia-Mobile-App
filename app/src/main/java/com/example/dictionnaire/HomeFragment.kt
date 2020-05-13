package com.example.dictionnaire


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

         //view?.setBackgroundColor()
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        var words = mutableListOf(Word(
            "Sheep",
            "Noun",
            "a domesticated ruminant mammal",
            "https://img.tfd.com/hm/mp3/S0328800.mp3",
            "https://i.pinimg.com/originals/6a/a5/94/6aa5940c04905952bc7d6cd61b5cd4e1.jpg"),
            Word(
                "Bird",
                "Noun",
                "bird is an animal with wings, feathers",
                "https://img.tfd.com/hm/mp3/B0273400.mp3",
                "https://image.shutterstock.com/image-vector/cute-blue-bird-cartoon-260nw-475041247.jpg"),
            Word(
                "Wolf",
                "Noun",
                "a wild carnivorous mammal ",
                "https://img.tfd.com/hm/mp3/W0200100.mp3",
                "https://image.shutterstock.com/image-vector/cheerful-wolf-on-white-background-260nw-164927918.jpg"),
            Word(
                "Dog",
                "Noun",
                "a domesticated carnivorous mammal ",
                "https://img.tfd.com/hm/mp3/D0320000.mp3",
                "https://image.freepik.com/free-vector/happy-dog-cartoon_49499-511.jpg"),
            Word(
                "Horse",
                "Noun",
                "a large plant-eating domesticated mammal",
                "https://img.tfd.com/hm/mp3/H0225800.mp3",
                "https://image.freepik.com/free-vector/cute-horse-cartoon_50699-40.jpg"),
            Word(
                "Goat",
                "Noun",
                "a hardy domesticated ruminant mammal",
                "https://img.tfd.com/hm/mp3/G0169200.mp3",
                "https://previews.123rf.com/images/dualororua/dualororua1605/dualororua160500016/56379057-cartoon-goat-character.jpg"),
            Word(
                "Rooster",
                "Noun",
                "a male domestic fowl",
                "https://img.tfd.com/hm/mp3/R0301300.mp3",
                "https://previews.123rf.com/images/sararoom/sararoom1611/sararoom161100017/66380112-vector-illustration-of-cartoon-rooster.jpg"),
            Word(
                "Cat",
                "Noun",
                "a small domesticated carnivore",
                "https://img.tfd.com/hm/mp3/C0151500.mp3",
                "https://img.pixers.pics/pho_wat(s3:700/FO/62/94/93/06/700_FO62949306_020b07b16b048d353b453df499d34053.jpg,492,700,cms:2018/10/5bd1b6b8d04b8_220x50-watermark.png,over,272,650,jpg)/wall-murals-funny-cat-cartoon.jpg.jpg"),
            Word(
                "Duck",
                "Noun",
                "ny of numerous wild or domesticated web-footed",
                "https://img.tfd.com/hm/mp3/D0418550.mp3",
                "https://img.freepik.com/free-vector/funny-cartoon-duck-swimming_50699-281.jpg?size=626&ext=jpg"),
            Word(
                "Elephant",
                "Noun",
                "an enormous, four-footed animal",
                "https://img.tfd.com/hm/mp3/E0084800.mp3",
                "https://image.shutterstock.com/image-vector/cartoon-cute-baby-elephant-sitting-260nw-710514844.jpg"))


        recycler_view_words!!.setHasFixedSize(true)
        recycler_view_words!!.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,true)
        recycler_view_words!!.adapter=WordAdapter(words)



    }


}
