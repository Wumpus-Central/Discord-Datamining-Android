.class public final synthetic Lcom/google/android/exoplayer2/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf9/q$a;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/exoplayer2/i;->a:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lcom/google/android/exoplayer2/i;->a:I

    check-cast p1, Lcom/google/android/exoplayer2/Player$a;

    invoke-static {v0, p1}, Lcom/google/android/exoplayer2/d0;->e0(ILcom/google/android/exoplayer2/Player$a;)V

    return-void
.end method
