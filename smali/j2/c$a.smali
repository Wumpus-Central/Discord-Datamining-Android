.class Lj2/c$a;
.super Lt2/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj2/c;->f(Lt2/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lt2/c<",
        "Ljava/lang/Float;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic d:Lt2/c;

.field final synthetic e:Lj2/c;


# direct methods
.method constructor <init>(Lj2/c;Lt2/c;)V
    .locals 0

    iput-object p1, p0, Lj2/c$a;->e:Lj2/c;

    iput-object p2, p0, Lj2/c$a;->d:Lt2/c;

    invoke-direct {p0}, Lt2/c;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lt2/b;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lj2/c$a;->d(Lt2/b;)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public d(Lt2/b;)Ljava/lang/Float;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt2/b<",
            "Ljava/lang/Float;",
            ">;)",
            "Ljava/lang/Float;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lj2/c$a;->d:Lt2/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lt2/c;->a(Lt2/b;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/Float;

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    return-object p1

    .line 13
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    const v0, 0x40233333    # 2.55f

    .line 18
    .line 19
    .line 20
    mul-float/2addr p1, v0

    .line 21
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
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
