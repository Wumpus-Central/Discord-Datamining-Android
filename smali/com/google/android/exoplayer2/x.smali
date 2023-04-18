.class public final synthetic Lcom/google/android/exoplayer2/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf9/q$a;


# instance fields
.field public final synthetic a:Lcom/google/android/exoplayer2/q0;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/exoplayer2/q0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/x;->a:Lcom/google/android/exoplayer2/q0;

    iput p2, p0, Lcom/google/android/exoplayer2/x;->b:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/exoplayer2/x;->a:Lcom/google/android/exoplayer2/q0;

    iget v1, p0, Lcom/google/android/exoplayer2/x;->b:I

    check-cast p1, Lcom/google/android/exoplayer2/Player$a;

    invoke-static {v0, v1, p1}, Lcom/google/android/exoplayer2/d0;->d0(Lcom/google/android/exoplayer2/q0;ILcom/google/android/exoplayer2/Player$a;)V

    return-void
.end method
