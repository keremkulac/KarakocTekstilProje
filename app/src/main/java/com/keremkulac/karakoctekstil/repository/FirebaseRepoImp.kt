package com.keremkulac.karakoctekstil.repository

import android.util.Log
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.database.*
import com.google.firebase.firestore.FirebaseFirestore
import com.keremkulac.karakoctekstil.model.Pattern

class FirebaseRepoImp : FirebaseRepo{
    private lateinit var firestore : FirebaseFirestore
    lateinit var pattern : List<Pattern>
    override fun getPatterns(): List<Pattern> {
         firestore.collection("Patterns").get().addOnSuccessListener { document ->
                if (document != null) {
                     pattern  = document.toObjects(Pattern::class.java)
                  //  val pattern : Pattern = document.toObjects(Pattern.class)
                }
                else {

                }
            }
            .addOnFailureListener { exception ->
                Log.d("TAG", "get failed with ", exception)
            }


        return pattern
    }
}