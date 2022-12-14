package org.alfinza.roomwordssample;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class WordViewModel extends AndroidViewModel {
    private WordRepository mRepository;
    private LiveData<List<Word>> mAllWords;

    public WordViewModel(@NonNull Application application) {
        super(application);
        mRepository = new WordRepository(application);
        mAllWords = mRepository.getAllWords();
    }

    public LiveData<List<Word>> getAllWords() {
        return mAllWords;
    }

    public void insert(Word word){
        mRepository.insert(word);
    }

    public void update(Word word){
        mRepository.update(word);
    }

    public void deleteAllWords(){
        mRepository.deleteAll();;
    }

    public void delete(Word word){
        mRepository.delete(word);
    }
}
