.class public final Lv9/w;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/google/android/gms/common/api/internal/j0;

.field public final b:I

.field public final c:Lu9/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu9/e<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/internal/j0;ILu9/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/internal/j0;",
            "I",
            "Lu9/e<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv9/w;->a:Lcom/google/android/gms/common/api/internal/j0;

    iput p2, p0, Lv9/w;->b:I

    iput-object p3, p0, Lv9/w;->c:Lu9/e;

    return-void
.end method
