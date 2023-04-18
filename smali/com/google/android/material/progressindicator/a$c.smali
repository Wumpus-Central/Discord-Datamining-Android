.class Lcom/google/android/material/progressindicator/a$c;
.super Landroidx/vectordrawable/graphics/drawable/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/progressindicator/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/material/progressindicator/a;


# direct methods
.method constructor <init>(Lcom/google/android/material/progressindicator/a;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/progressindicator/a$c;->a:Lcom/google/android/material/progressindicator/a;

    invoke-direct {p0}, Landroidx/vectordrawable/graphics/drawable/b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/google/android/material/progressindicator/a$c;->a:Lcom/google/android/material/progressindicator/a;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1, v0}, Lcom/google/android/material/progressindicator/a;->setIndeterminate(Z)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lcom/google/android/material/progressindicator/a$c;->a:Lcom/google/android/material/progressindicator/a;

    .line 8
    .line 9
    invoke-static {p1}, Lcom/google/android/material/progressindicator/a;->d(Lcom/google/android/material/progressindicator/a;)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget-object v1, p0, Lcom/google/android/material/progressindicator/a$c;->a:Lcom/google/android/material/progressindicator/a;

    .line 14
    .line 15
    invoke-static {v1}, Lcom/google/android/material/progressindicator/a;->e(Lcom/google/android/material/progressindicator/a;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {p1, v0, v1}, Lcom/google/android/material/progressindicator/a;->o(IZ)V

    .line 20
    .line 21
    .line 22
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method
