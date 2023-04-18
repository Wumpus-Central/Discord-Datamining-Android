.class public Lnet/time4j/calendar/service/f;
.super Lnet/time4j/calendar/service/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lfj/q<",
        "TT;>;>",
        "Lnet/time4j/calendar/service/d<",
        "Ljava/lang/Integer;",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x450b5dcbe1e0bbbeL


# instance fields
.field private final transient n:I

.field private final transient o:I

.field private final transient p:Lfj/v;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/v<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final transient q:Lfj/v;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/v<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Class;IIC)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;IIC)V"
        }
    .end annotation

    const-string v0, "DAY_OF_"

    .line 1
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    invoke-direct {p0, p1, p2, p5, v0}, Lnet/time4j/calendar/service/d;-><init>(Ljava/lang/String;Ljava/lang/Class;CZ)V

    .line 2
    iput p3, p0, Lnet/time4j/calendar/service/f;->n:I

    .line 3
    iput p4, p0, Lnet/time4j/calendar/service/f;->o:I

    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lnet/time4j/calendar/service/f;->p:Lfj/v;

    .line 5
    iput-object p1, p0, Lnet/time4j/calendar/service/f;->q:Lfj/v;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Class;IICLfj/v;Lfj/v;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;IIC",
            "Lfj/v<",
            "TT;>;",
            "Lfj/v<",
            "TT;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 6
    invoke-direct {p0, p1, p2, p5, v0}, Lnet/time4j/calendar/service/d;-><init>(Ljava/lang/String;Ljava/lang/Class;CZ)V

    .line 7
    iput p3, p0, Lnet/time4j/calendar/service/f;->n:I

    .line 8
    iput p4, p0, Lnet/time4j/calendar/service/f;->o:I

    .line 9
    iput-object p6, p0, Lnet/time4j/calendar/service/f;->p:Lfj/v;

    .line 10
    iput-object p7, p0, Lnet/time4j/calendar/service/f;->q:Lfj/v;

    return-void
.end method


# virtual methods
.method public A()Ljava/lang/Integer;
    .locals 1

    iget v0, p0, Lnet/time4j/calendar/service/f;->n:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic S()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnet/time4j/calendar/service/f;->A()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic f()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnet/time4j/calendar/service/f;->y()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public getType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const-class v0, Ljava/lang/Integer;

    return-object v0
.end method

.method public y()Ljava/lang/Integer;
    .locals 1

    iget v0, p0, Lnet/time4j/calendar/service/f;->o:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
