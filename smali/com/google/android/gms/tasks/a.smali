.class public final Lcom/google/android/gms/tasks/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/concurrent/Executor;

.field static final b:Ljava/util/concurrent/Executor;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/tasks/v;

    invoke-direct {v0}, Lcom/google/android/gms/tasks/v;-><init>()V

    sput-object v0, Lcom/google/android/gms/tasks/a;->a:Ljava/util/concurrent/Executor;

    new-instance v0, Lcom/google/android/gms/tasks/u;

    invoke-direct {v0}, Lcom/google/android/gms/tasks/u;-><init>()V

    sput-object v0, Lcom/google/android/gms/tasks/a;->b:Ljava/util/concurrent/Executor;

    return-void
.end method
