.class public Lcom/linkedin/android/litr/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/linkedin/android/litr/b$b;
    }
.end annotation


# instance fields
.field private final a:Lne/c;

.field private final b:Lhe/a;

.field private final c:Loe/i;

.field private final d:Lhe/b;

.field private final e:Lne/d;

.field private final f:Landroid/media/MediaFormat;

.field private final g:I

.field private final h:I


# direct methods
.method private constructor <init>(Lne/c;Lhe/a;Loe/i;Lhe/b;Lne/d;Landroid/media/MediaFormat;II)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/linkedin/android/litr/b;->a:Lne/c;

    .line 4
    iput-object p2, p0, Lcom/linkedin/android/litr/b;->b:Lhe/a;

    .line 5
    iput-object p3, p0, Lcom/linkedin/android/litr/b;->c:Loe/i;

    .line 6
    iput-object p4, p0, Lcom/linkedin/android/litr/b;->d:Lhe/b;

    .line 7
    iput-object p5, p0, Lcom/linkedin/android/litr/b;->e:Lne/d;

    .line 8
    iput-object p6, p0, Lcom/linkedin/android/litr/b;->f:Landroid/media/MediaFormat;

    .line 9
    iput p7, p0, Lcom/linkedin/android/litr/b;->g:I

    .line 10
    iput p8, p0, Lcom/linkedin/android/litr/b;->h:I

    return-void
.end method

.method synthetic constructor <init>(Lne/c;Lhe/a;Loe/i;Lhe/b;Lne/d;Landroid/media/MediaFormat;IILcom/linkedin/android/litr/b$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p8}, Lcom/linkedin/android/litr/b;-><init>(Lne/c;Lhe/a;Loe/i;Lhe/b;Lne/d;Landroid/media/MediaFormat;II)V

    return-void
.end method


# virtual methods
.method public a()Lhe/a;
    .locals 1

    iget-object v0, p0, Lcom/linkedin/android/litr/b;->b:Lhe/a;

    return-object v0
.end method

.method public b()Lhe/b;
    .locals 1

    iget-object v0, p0, Lcom/linkedin/android/litr/b;->d:Lhe/b;

    return-object v0
.end method

.method public c()Lne/c;
    .locals 1

    iget-object v0, p0, Lcom/linkedin/android/litr/b;->a:Lne/c;

    return-object v0
.end method

.method public d()Lne/d;
    .locals 1

    iget-object v0, p0, Lcom/linkedin/android/litr/b;->e:Lne/d;

    return-object v0
.end method

.method public e()Loe/i;
    .locals 1

    iget-object v0, p0, Lcom/linkedin/android/litr/b;->c:Loe/i;

    return-object v0
.end method

.method public f()I
    .locals 1

    iget v0, p0, Lcom/linkedin/android/litr/b;->g:I

    return v0
.end method

.method public g()Landroid/media/MediaFormat;
    .locals 1

    iget-object v0, p0, Lcom/linkedin/android/litr/b;->f:Landroid/media/MediaFormat;

    return-object v0
.end method

.method public h()I
    .locals 1

    iget v0, p0, Lcom/linkedin/android/litr/b;->h:I

    return v0
.end method
