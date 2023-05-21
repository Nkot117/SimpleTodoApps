package com.websarva.wings.android.simpletodoapps.fragment

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.fragment.app.DialogFragment
import com.websarva.wings.android.simpletodoapps.R

class TaskAddDialogFragment: DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val inflater = requireActivity().layoutInflater;

        return activity?.let {
            AlertDialog.Builder(it)
                .setView(inflater.inflate(R.layout.dialog_task_add_dialog, null))
                .setTitle(R.string.add_task_dialog_title)
                .setPositiveButton(
                    R.string.add_task_dialog_positive_button,
                    DialogButtonClickListener()
                )
                .setNegativeButton(
                    R.string.add_task_dialog_negative_button,
                    DialogButtonClickListener()
                )
                .create()
        } ?: throw IllegalStateException("Activity cannot be null")
    }

    private inner class DialogButtonClickListener : DialogInterface.OnClickListener{
        override fun onClick(dialog: DialogInterface?, witch: Int) {
            when(witch){
                Dialog.BUTTON_POSITIVE -> {
                    Toast.makeText(activity,"追加ボタンをタップ",LENGTH_SHORT).show()
                }
                Dialog.BUTTON_NEGATIVE -> {
                    Toast.makeText(activity,"キャンセルボタンをタップ",LENGTH_SHORT).show()
                }
            }
        }
    }
}
