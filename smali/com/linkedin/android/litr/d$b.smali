.class public Lcom/linkedin/android/litr/d$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/linkedin/android/litr/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private a:I

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lje/b;",
            ">;"
        }
    .end annotation
.end field

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lje/a;",
            ">;"
        }
    .end annotation
.end field

.field private d:Lcom/linkedin/android/litr/io/MediaRange;

.field private e:Z

.field private f:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x64

    .line 5
    .line 6
    iput v0, p0, Lcom/linkedin/android/litr/d$b;->a:I

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
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
.end method


# virtual methods
.method public a()Lcom/linkedin/android/litr/d;
    .locals 9

    new-instance v8, Lcom/linkedin/android/litr/d;

    iget v1, p0, Lcom/linkedin/android/litr/d$b;->a:I

    iget-object v2, p0, Lcom/linkedin/android/litr/d$b;->b:Ljava/util/List;

    iget-object v3, p0, Lcom/linkedin/android/litr/d$b;->c:Ljava/util/List;

    iget-object v4, p0, Lcom/linkedin/android/litr/d$b;->d:Lcom/linkedin/android/litr/io/MediaRange;

    iget-boolean v5, p0, Lcom/linkedin/android/litr/d$b;->e:Z

    iget-boolean v6, p0, Lcom/linkedin/android/litr/d$b;->f:Z

    const/4 v7, 0x0

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lcom/linkedin/android/litr/d;-><init>(ILjava/util/List;Ljava/util/List;Lcom/linkedin/android/litr/io/MediaRange;ZZLcom/linkedin/android/litr/d$a;)V

    return-object v8
.end method
