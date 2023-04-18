.class public final Li0/p$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li0/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Li0/p$b$a;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Li0/f$b;

    .line 5
    .line 6
    invoke-direct {v0}, Li0/f$b;-><init>()V

    .line 7
    .line 8
    .line 9
    const-wide/16 v1, 0x0

    .line 10
    .line 11
    invoke-virtual {v0, v1, v2}, Li0/f$b;->c(J)Li0/p$b$a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Li0/p$a;->a:Li0/p$b$a;

    .line 16
    .line 17
    const-string v1, "File can\'t be null."

    .line 18
    .line 19
    invoke-static {p1, v1}, Landroidx/core/util/g;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1}, Li0/p$b$a;->b(Ljava/io/File;)Li0/p$b$a;

    .line 23
    .line 24
    .line 25
    return-void
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


# virtual methods
.method public a()Li0/p;
    .locals 2

    new-instance v0, Li0/p;

    iget-object v1, p0, Li0/p$a;->a:Li0/p$b$a;

    invoke-virtual {v1}, Li0/p$b$a;->a()Li0/p$b;

    move-result-object v1

    invoke-direct {v0, v1}, Li0/p;-><init>(Li0/p$b;)V

    return-object v0
.end method
