.class Lcom/google/android/gms/nearby/messages/internal/r;
.super Lza/s;
.source "SourceFile"


# static fields
.field private static final b:Lra/d1;


# instance fields
.field private final a:Lcom/google/android/gms/common/api/internal/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/nearby/messages/internal/q;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/messages/internal/q;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/messages/internal/r;->b:Lra/d1;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/common/api/internal/d;)V
    .locals 0

    invoke-direct {p0}, Lza/s;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/nearby/messages/internal/r;->a:Lcom/google/android/gms/common/api/internal/d;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/r;->a:Lcom/google/android/gms/common/api/internal/d;

    if-eqz v0, :cond_0

    sget-object v1, Lcom/google/android/gms/nearby/messages/internal/r;->b:Lra/d1;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/d;->c(Lcom/google/android/gms/common/api/internal/d$b;)V

    :cond_0
    return-void
.end method
