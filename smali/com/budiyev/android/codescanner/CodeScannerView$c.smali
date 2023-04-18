.class final Lcom/budiyev/android/codescanner/CodeScannerView$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/budiyev/android/codescanner/CodeScannerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation


# instance fields
.field final synthetic k:Lcom/budiyev/android/codescanner/CodeScannerView;


# direct methods
.method private constructor <init>(Lcom/budiyev/android/codescanner/CodeScannerView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/budiyev/android/codescanner/CodeScannerView$c;->k:Lcom/budiyev/android/codescanner/CodeScannerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/budiyev/android/codescanner/CodeScannerView;Lcom/budiyev/android/codescanner/CodeScannerView$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/budiyev/android/codescanner/CodeScannerView$c;-><init>(Lcom/budiyev/android/codescanner/CodeScannerView;)V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/budiyev/android/codescanner/CodeScannerView$c;->k:Lcom/budiyev/android/codescanner/CodeScannerView;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/budiyev/android/codescanner/CodeScannerView;->a(Lcom/budiyev/android/codescanner/CodeScannerView;)Lcom/budiyev/android/codescanner/CodeScanner;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/budiyev/android/codescanner/CodeScanner;->R()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p1}, Lcom/budiyev/android/codescanner/CodeScanner;->Q()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    xor-int/lit8 v0, v0, 0x1

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Lcom/budiyev/android/codescanner/CodeScanner;->d0(Z)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lcom/budiyev/android/codescanner/CodeScannerView$c;->k:Lcom/budiyev/android/codescanner/CodeScannerView;

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Lcom/budiyev/android/codescanner/CodeScannerView;->setFlashEnabled(Z)V

    .line 28
    .line 29
    .line 30
    :cond_1
    :goto_0
    return-void
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method
