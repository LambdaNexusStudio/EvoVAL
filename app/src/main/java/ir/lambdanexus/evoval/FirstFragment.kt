package ir.lambdanexus.evoval

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R
import com.example.myapplication.databinding.AskBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: AskBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        _binding = AskBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonYes.setOnClickListener {
            findNavController().navigate(R.id.action_firstFragment_to_gay_istrue)
        }
        binding.buttonNo.setOnClickListener {
            findNavController().navigate(R.id.action_firstFragment_to_gay_isfalse)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}