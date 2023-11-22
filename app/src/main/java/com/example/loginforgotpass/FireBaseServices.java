package com.example.loginforgotpass;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;

public class FireBaseServices {
   private  static FireBaseServices instance ;
   private FirebaseAuth auth;
   private FirebaseFirestore fire;
   private FirebaseStorage storage;
   private FireBaseServices fbs;

   public  FireBaseServices(){
      auth=FirebaseAuth.getInstance();
      fire=FirebaseFirestore.getInstance();
      storage=FirebaseStorage.getInstance();
      fbs=FireBaseServices.getInstance();
   }

   public FirebaseStorage getStorage() {
      return storage;
   }

   public void setStorage(FirebaseStorage storage) {
      this.storage = storage;
   }

   public FirebaseFirestore getFire() {
      return fire;
   }

   public void setFire(FirebaseFirestore fire) {
      this.fire = fire;
   }

   public FirebaseAuth getAuth() {
      return auth;
   }

   public void setAuth(FirebaseAuth auth) {
      this.auth = auth;
   }

   public  static FireBaseServices getInstance(){
      if (instance==null)
      {
         instance=new FireBaseServices();
      }
      return instance;
   }
}



