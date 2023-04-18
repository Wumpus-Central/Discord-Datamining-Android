.class Lwb/g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwb/k$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwb/g;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:F

.field final synthetic b:Lwb/g;


# direct methods
.method constructor <init>(Lwb/g;F)V
    .locals 0

    iput-object p1, p0, Lwb/g$b;->b:Lwb/g;

    iput p2, p0, Lwb/g$b;->a:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lwb/c;)Lwb/c;
    .locals 2

    .line 1
    instance-of v0, p1, Lwb/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    new-instance v0, Lwb/b;

    .line 7
    .line 8
    iget v1, p0, Lwb/g$b;->a:F

    .line 9
    .line 10
    invoke-direct {v0, v1, p1}, Lwb/b;-><init>(FLwb/c;)V

    .line 11
    .line 12
    .line 13
    move-object p1, v0

    .line 14
    :goto_0
    return-object p1
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method
