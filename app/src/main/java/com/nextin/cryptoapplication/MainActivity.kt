package com.nextin.cryptoapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.nextin.cryptoapplication.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var arrayList: ArrayList<Crypto>
    private var binding :ActivityMainBinding? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)


         val coinIconArray =  arrayOf(
            R.drawable.bitcoin ,
            R.drawable.dog ,
            R.drawable.tron ,
            R.drawable.monero ,
            R.drawable.tether ,
            R.drawable.maker ,
            R.drawable.ethereum__1_ ,
            R.drawable.litecoin ,
            R.drawable.thorchain ,
            R.drawable.ethereum_classic_logo

        )

        val coinNameArray = arrayOf(
            "Bitcoin",
            "Doge Coin",
            "Tron",
            "Monero",
            "Tether",
            "Maker",
            "Ethereum",
            "LiteCoin",
            "ThorCoin",
            "Ethereum Classic"

        )

        val coinPriceArray = arrayOf(
            "$67,631.30 ",
            "$0.1594",
            "$0.1117",
            "$149.34",
            "$0.9992",
            "$2,711.19",
            "$3,789.57",
            "$83.24",
            "$6.01",
            "$29.23",
        )

        binding?.rvMain?.layoutManager = LinearLayoutManager(this)
        arrayList = arrayListOf()


        for(index in coinIconArray.indices)
        {
            val coins = Crypto(coinIconArray[index],coinNameArray[index],coinPriceArray[index])
            arrayList.add(coins)
        }

        binding?.rvMain?.adapter = MyAdapter(arrayList, this)
    }
}