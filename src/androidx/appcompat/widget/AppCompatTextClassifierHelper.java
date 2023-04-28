package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.util.C2517g;

/* loaded from: classes.dex */
final class AppCompatTextClassifierHelper {

    /* renamed from: a */
    private TextView f1147a;

    /* renamed from: b */
    private TextClassifier f1148b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppCompatTextClassifierHelper(TextView textView) {
        this.f1147a = (TextView) C2517g.m37588g(textView);
    }

    /* renamed from: a */
    public TextClassifier m40470a() {
        TextClassifier textClassifier;
        TextClassifier textClassifier2;
        TextClassifier textClassifier3 = this.f1148b;
        if (textClassifier3 != null) {
            return textClassifier3;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) this.f1147a.getContext().getSystemService(TextClassificationManager.class);
        if (textClassificationManager != null) {
            textClassifier2 = textClassificationManager.getTextClassifier();
            return textClassifier2;
        }
        textClassifier = TextClassifier.NO_OP;
        return textClassifier;
    }

    /* renamed from: b */
    public void m40469b(TextClassifier textClassifier) {
        this.f1148b = textClassifier;
    }
}
