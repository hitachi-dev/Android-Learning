package com.example.androidlearning.fragments.recycleview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.androidlearning.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [RecycleViewFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class RecycleViewFragment : Fragment() {
    private var recycleView: RecyclerView? = null

    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recycle_view, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recycleView = view.findViewById(R.id.recycleview_simple_rv)
        initializeRecycleView()
    }

    private fun initializeRecycleView() {
        recycleView?.layoutManager = LinearLayoutManager(context)
        recycleView?.adapter = RecycleViewAdapter(
            listOf(
                "dytxvnecwf@temporary-mail.net" to "2638  Lang Avenue",
                "xywl4jfcop@temporary-mail.net" to "1856  Pooz Street",
                "cl6xfnhobss@temporary-mail.net" to "140  Pleasant Hill Road",
                "cw4x126allp@temporary-mail.net" to "820  Oral Lake Road",
                "067frljrejtc@temporary-mail.net" to "2441  Cambridge Drive",
                "rd52q08jnps@temporary-mail.net" to "4842  Fairmont Avenue",
                "qmrlfisexud@temporary-mail.net" to "2183  Ridge Road",
                "ow0w904d8cb@temporary-mail.net" to "1815  Rivendell Drive",
                "7ff3x0povge@temporary-mail.net" to "3989  Parkway Drive",
                "6dj5gk68tnb@temporary-mail.net" to "1248  Watson Street",
                "axof1mjrg4d@temporary-mail.net" to "2149  Cody Ridge Road",
                "qd4057lisyn@temporary-mail.net" to "2493  Columbia Mine Road",
                "qd4057lisyn@temporary-mail.net" to "2493  Columbia Mine Road",
                "qd4057lisyn@temporary-mail.net" to "2493  Columbia Mine Road",
                "qd4057lisyn@temporary-mail.net" to "2493  Columbia Mine Road",
                "qd4057lisyn@temporary-mail.net" to "2493  Columbia Mine Road",
                "qd4057lisyn@temporary-mail.net" to "2493  Columbia Mine Road",
                "qd4057lisyn@temporary-mail.net" to "2493  Columbia Mine Road",
                "qd4057lisyn@temporary-mail.net" to "2493  Columbia Mine Road",
                "qd4057lisyn@temporary-mail.net" to "2493  Columbia Mine Road",
                "qd4057lisyn@temporary-mail.net" to "2493  Columbia Mine Road",
                "qd4057lisyn@temporary-mail.net" to "2493  Columbia Mine Road",
            )
        )
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment RecycleViewFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            RecycleViewFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}